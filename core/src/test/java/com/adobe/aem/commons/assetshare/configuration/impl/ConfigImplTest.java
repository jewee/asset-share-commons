package com.adobe.aem.commons.assetshare.configuration.impl;

import com.adobe.aem.commons.assetshare.configuration.Config;
import com.adobe.aem.commons.assetshare.util.RequireAem;
import com.adobe.aem.commons.assetshare.util.impl.RequireAemImpl;
import io.wcm.testing.mock.aem.junit.AemContext;
import org.apache.sling.models.factory.ModelFactory;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ConfigImplTest {

    @Rule
    public final AemContext ctx = new AemContext();

    @Mock
    ModelFactory modelFactory;

    @BeforeEach
    public void setUp() throws Exception {
        ctx.load().json("/com/adobe/aem/commons/assetshare/configuration/impl/ConfigImplTest.json",
                "/content");

        ctx.registerService(RequireAem.class, new RequireAemImpl());

        ctx.registerService(ModelFactory.class, modelFactory, org.osgi.framework.Constants.SERVICE_RANKING,
                Integer.MAX_VALUE);

        ctx.addModelsForClasses(Config.class);
    }

    @Test
    public void isContextHubEnabled_noContextHub() {
        ctx.currentResource("/content/no-contexthub");
        final Config config = ctx.request().adaptTo(Config.class);

        assertFalse(config.isContextHubEnabled());
    }

    @Test
    public void isContextHubEnabled_invalidContextHub() {
        ctx.currentResource("/content/invalid-contexthub");
        final Config config = ctx.request().adaptTo(Config.class);

        assertFalse(config.isContextHubEnabled());
    }

    @Test
    public void isContextHubEnabled_validContextHub() {
        ctx.currentResource("/content/valid-contexthub");
        final Config config = ctx.request().adaptTo(Config.class);

        assertTrue(config.isContextHubEnabled());
    }

}