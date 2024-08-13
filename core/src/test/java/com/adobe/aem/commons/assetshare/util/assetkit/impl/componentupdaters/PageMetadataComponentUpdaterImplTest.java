package com.adobe.aem.commons.assetshare.util.assetkit.impl.componentupdaters;

import com.adobe.aem.commons.assetshare.util.assetkit.ComponentUpdater;
import com.adobe.aem.commons.assetshare.util.assetkit.impl.AssetKitHelperImpl;
import com.day.cq.search.QueryBuilder;
import com.day.cq.wcm.api.Page;
import io.wcm.testing.mock.aem.junit.AemContext;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.models.factory.ModelFactory;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.osgi.framework.Constants;

import javax.jcr.RepositoryException;

import static com.adobe.aem.commons.assetshare.testing.MockAssetModels.mockModelFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PageMetadataComponentUpdaterImplTest {

    @Rule
    public AemContext ctx = new AemContext();

    @Mock
    QueryBuilder queryBuilder;

    @Mock
    ModelFactory modelFactory;

    @BeforeEach
    public void setUp() throws Exception {
        ctx.load().json(getClass().getResourceAsStream("ComponentUpdaterTest.json"), "/content");

        mockModelFactory(ctx, modelFactory, "/content/dam/folder/banner.png");
        mockModelFactory(ctx, modelFactory, "/content/dam/folder/test-1.png");
        mockModelFactory(ctx, modelFactory, "/content/dam/folder/test-2.png");
        mockModelFactory(ctx, modelFactory, "/content/dam/folder/test-3.png");

        ctx.registerService(ModelFactory.class, modelFactory, Constants.SERVICE_RANKING, Integer.MAX_VALUE);

        ctx.registerService(QueryBuilder.class, queryBuilder);

        ctx.registerInjectActivateService(new AssetKitHelperImpl());
        ctx.registerInjectActivateService(new PageMetadataComponentUpdaterImpl());
    }

    @Test
    public void getName() {
        ComponentUpdater componentUpdater = ctx.getService(ComponentUpdater.class);
        assertEquals("Page metadata (Asset Share Commons)", componentUpdater.getName());
    }

    @Test
    public void updateComponent() throws PersistenceException, RepositoryException {
        ComponentUpdater componentUpdater = ctx.getService(ComponentUpdater.class);

        componentUpdater.updateComponent(ctx.resourceResolver().getResource("/content/page").adaptTo(Page.class), ctx.resourceResolver().getResource("/content/dam/folder"));

        String actualTitle = ctx.resourceResolver().getResource("/content/page/jcr:content").getValueMap().get("jcr:title", String.class);
        String actualDescription = ctx.resourceResolver().getResource("/content/page/jcr:content").getValueMap().get("jcr:description", String.class);

        assertEquals("My Asset Kit", actualTitle, "Page title");
        assertEquals("My Asset Kit Description", actualDescription, "Page description");
    }
}