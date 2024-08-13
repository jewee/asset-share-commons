<a id="top"></a>

<p style="font-size: 24px;"><img src="./qct-icons/transform-logo.svg" style="margin-right: 15px; vertical-align: middle;"></img><b>Code Transformation Summary by Amazon Q </b></p>
<p><img src="./qct-icons/transform-variables-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Lines of code in your application: 19520 <p>
<p><img src="./qct-icons/transform-clock-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Transformation duration: 77 min(s) <p>
<p><img src="./qct-icons/transform-dependencies-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned dependencies replaced: 8 of 26 <p>
<p><img src="./qct-icons/transform-dependencyAnalyzer-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Additional dependencies added: 20 <p>
<p><img src="./qct-icons/transform-smartStepInto-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned deprecated code instances replaced: 0 of 0 <p>
<p><img src="./qct-icons/transform-listFiles-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Files changed: 136 <p>
<p><img src="./qct-icons/transform-build-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Build status in Java 17: <span style="color: #CCCC00">PARTIALLY_SUCCEEDED</span> <p>

### Table of Contents

1. <a href="#build-log-summary">Build log summary</a> 
1. <a href="#planned-dependencies-replaced">Planned dependencies replaced</a> 
1. <a href="#additional-dependencies-added">Additional dependencies added</a> 
1. <a href="#deprecated-code-replaced">Deprecated code replaced</a> 
1. <a href="#other-changes">Other changes</a> 
1. <a href="#all-files-changed">All files changed</a> 
1. <a href="#next-steps">Next steps</a> 


### Build log summary <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="build-log-summary"></a>

Amazon Q could not build the upgraded code in Java 17. The following build log snippet that shows the errors Amazon Q encountered during the build log. To view the full build log, open [`buildCommandOutput.log`](./buildCommandOutput.log)

```
The Maven build failed while building the Asset Share Commons - Core module due to a missing dependency. The build was successful for the UI modules but failed during the build of the Core module because it could not resolve the org.apache.httpcomponents.core5:httpcore5:jar:5.3.x dependency which was not found in Maven Central. The build did not complete.
```


### Planned dependencies replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="planned-dependencies-replaced"></a>

Amazon Q updated the following dependencies that it identified in the transformation plan

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `jakarta.activation:jakarta.activation-api` | Added | - | 2.1.3 |
| `jakarta.annotation:jakarta.annotation-api` | Added | - | 3.0.0 |
| `jakarta.inject:jakarta.inject-api` | Added | - | 2.0.1 |
| `jakarta.mail:jakarta.mail-api` | Added | - | 2.1.3 |
| `jakarta.servlet:jakarta.servlet-api` | Added | - | 6.1.0 |
| `org.apache.httpcomponents.client5:httpclient5` | Added | - | 5.3.1 |
| `org.apache.httpcomponents.core5:httpcore5` | Added | - | 5.3.x |
| `org.mockito:mockito-junit-jupiter` | Added | - | 5.12.0 |

### Additional dependencies added <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="additional-dependencies-added"></a>

Amazon Q updated the following additional dependencies during the upgrade

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `com.adobe.aem:aem-sdk-api` | Updated | - | 2024.7.17098.20240711T134106Z-240600 |
| `com.adobe.cq:core.wcm.components.content` | Updated | 2.17.14 | 2.25.4 |
| `com.adobe.cq:core.wcm.components.core` | Updated | 2.17.14 | 2.25.4 |
| `com.google.code.findbugs:jsr305` | Updated | 3.0.0 | 3.0.2 |
| `com.google.code.gson:gson` | Updated | 2.8.9 | 2.11.0 |
| `io.wcm.maven:io.wcm.maven.aem-dependencies` | Updated | 6.5.19.0000 | 6.5.21.0000 |
| `io.wcm:io.wcm.testing.aem-mock.junit4` | Updated | 5.0.0 | - |
| `junit:junit` | Updated | - | 4.13.2 |
| `org.apache.maven.plugins:maven-assembly-plugin` | Updated | - | 3.7.1 |
| `org.apache.maven.plugins:maven-enforcer-plugin` | Updated | 3.4.1 | 3.5.0 |
| `org.apache.maven.plugins:maven-release-plugin` | Updated | 3.0.0 | 3.1.0 |
| `org.apache.maven.plugins:maven-source-plugin` | Updated | 3.3.0 | 3.3.1 |
| `org.apache.sling:org.apache.sling.api` | Updated | 2.22.0 | 2.27.6 |
| `org.apache.sling:org.apache.sling.javax.activation` | Updated | 0.1.0 | 0.3.0 |
| `org.apache.sling:org.apache.sling.testing.osgi-mock.junit4` | Updated | 3.3.6 | - |
| `org.apache.sling:org.apache.sling.testing.sling-mock.junit4` | Updated | 3.4.10 | 3.5.0 |
| `org.junit.jupiter:junit-jupiter` | Added | - | 5.10.3 |
| `org.mockito:mockito-core` | Updated | 4.8.1 | - |
| `org.osgi:org.osgi.util.converter` | Updated | 1.0.9 | - |
| `org.osgi:org.osgi.util.tracker` | Updated | 1.5.2 | 1.5.4 |

### Deprecated code replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="deprecated-code-replaced"></a>

Amazon Q replaced the following instances of deprecated code. An instance with 0 files
changed indicates Amazon Q wasn't able to replace the deprecated code.

| Deprecated code | Files changed |
|----------------|----------------|


### Other changes <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="other-changes"></a>



### All files changed <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="all-files-changed"></a>

| File | Action |
|----------------|--------|
| [.github/workflows/maven-release.yml](../.github/workflows/maven-release.yml) | Updated |
| [all/pom.xml](../all/pom.xml) | Updated |
| [core.cloud/pom.xml](../core.cloud/pom.xml) | Updated |
| [core.cloud/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/download/async/impl/AsyncAssetRenditionsDownloadServlet.java](../core.cloud/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/download/async/impl/AsyncAssetRenditionsDownloadServlet.java) | Updated |
| [core.cloud/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/AssetDeliveryRenditionDispatcherImpl.java](../core.cloud/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/AssetDeliveryRenditionDispatcherImpl.java) | Updated |
| [core.cloud/src/test/java/com/adobe/aem/commons/assetshare/components/actions/download/impl/AsyncAssetRenditionsDownloadServletTest.java](../core.cloud/src/test/java/com/adobe/aem/commons/assetshare/components/actions/download/impl/AsyncAssetRenditionsDownloadServletTest.java) | Updated |
| [core.cloud/src/test/java/com/adobe/aem/commons/assetshare/components/actions/download/impl/DownloadImplTest.java](../core.cloud/src/test/java/com/adobe/aem/commons/assetshare/components/actions/download/impl/DownloadImplTest.java) | Updated |
| [core.cloud/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/async/impl/AsyncAssetRenditionsDownloadServletTest.java](../core.cloud/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/async/impl/AsyncAssetRenditionsDownloadServletTest.java) | Updated |
| [core.cloud/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/async/impl/ExpressionDownloadArchiveNamerTest.java](../core.cloud/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/async/impl/ExpressionDownloadArchiveNamerTest.java) | Updated |
| [core.cloud/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/AssetDeliveryRenditionDispatcherImplTest.java](../core.cloud/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/AssetDeliveryRenditionDispatcherImplTest.java) | Updated |
| [core/pom.xml](../core/pom.xml) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/cart/impl/CartImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/cart/impl/CartImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/download/impl/DownloadImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/download/impl/DownloadImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/impl/ActionPageServlet.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/impl/ActionPageServlet.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/share/impl/EmailShareImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/share/impl/EmailShareImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/share/impl/EmailShareServiceImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/share/impl/EmailShareServiceImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/share/impl/ShareImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/share/impl/ShareImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/share/impl/ShareServlet.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/actions/share/impl/ShareServlet.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/assetkit/impl/AssetKitImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/assetkit/impl/AssetKitImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/ActionButtonsImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/ActionButtonsImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/EditorLinksImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/EditorLinksImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/ImageImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/ImageImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/MetadataImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/MetadataImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/PdfImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/PdfImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/RenditionsImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/RenditionsImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/TagsImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/TagsImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/TitleImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/TitleImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/VideoImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/details/impl/VideoImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/AbstractPredicate.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/AbstractPredicate.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/DatePredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/DatePredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/FreeformTextPredicatePredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/FreeformTextPredicatePredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/FulltextPredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/FulltextPredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/HiddenPredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/HiddenPredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/PagePredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/PagePredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/PathPredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/PathPredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/PropertyPredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/PropertyPredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/SortPredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/SortPredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/TagsPredicateImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/predicates/impl/TagsPredicateImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/search/impl/SearchConfigImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/search/impl/SearchConfigImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/search/impl/StatisticsImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/search/impl/StatisticsImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/structure/impl/HeaderImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/structure/impl/HeaderImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/components/structure/impl/UserMenuImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/components/structure/impl/UserMenuImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/AssetDetails404Servlet.java](../core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/AssetDetails404Servlet.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/AssetDetailsImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/AssetDetailsImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/ConfigImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/ConfigImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/MessagesImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/MessagesImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/datasources/AssetDetailsSelectorDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/datasources/AssetDetailsSelectorDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/datasources/SearchResultsResourceTypeDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/configuration/impl/datasources/SearchResultsResourceTypeDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/AssetModelImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/AssetModelImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/AssetResolverImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/AssetResolverImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/CombinedProperties.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/CombinedProperties.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/datasources/AssetRenditionsDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/datasources/AssetRenditionsDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/datasources/ComputedPropertiesDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/datasources/ComputedPropertiesDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/datasources/MetadataSchemaPropertiesDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/impl/datasources/MetadataSchemaPropertiesDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/AssetRenditionDispatcher.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/AssetRenditionDispatcher.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/AssetRenditionParameters.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/AssetRenditionParameters.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionDownloadResponse.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionDownloadResponse.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionStreamerImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionStreamerImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionsDownloadServlet.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionsDownloadServlet.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/AssetRenditionServlet.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/AssetRenditionServlet.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/AbstractRenditionDispatcherImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/AbstractRenditionDispatcherImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/ExternalRedirectRenditionDispatcherImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/ExternalRedirectRenditionDispatcherImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/InternalRedirectRenditionDispatcherImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/InternalRedirectRenditionDispatcherImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/StaticRenditionDispatcherImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/StaticRenditionDispatcherImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/search/impl/SearchImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/search/impl/SearchImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/search/impl/datasources/FilterablePropertiesDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/search/impl/datasources/FilterablePropertiesDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/search/impl/datasources/OrderablePropertiesDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/search/impl/datasources/OrderablePropertiesDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/search/impl/datasources/SearchPredicatesDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/search/impl/datasources/SearchPredicatesDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/search/results/impl/result/AssetResultImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/search/results/impl/result/AssetResultImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/util/EmailService.java](../core/src/main/java/com/adobe/aem/commons/assetshare/util/EmailService.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/util/PredicateUtil.java](../core/src/main/java/com/adobe/aem/commons/assetshare/util/PredicateUtil.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/componentupdaters/BannerComponentUpdaterImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/componentupdaters/BannerComponentUpdaterImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/datasources/ComponentUpdatersDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/datasources/ComponentUpdatersDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/datasources/PagePathGeneratorsDataSource.java](../core/src/main/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/datasources/PagePathGeneratorsDataSource.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/util/impl/EmailServiceImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/util/impl/EmailServiceImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/util/impl/JsonResolverImpl.java](../core/src/main/java/com/adobe/aem/commons/assetshare/util/impl/JsonResolverImpl.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/util/impl/responses/DiscardingResponseWrapper.java](../core/src/main/java/com/adobe/aem/commons/assetshare/util/impl/responses/DiscardingResponseWrapper.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/workflow/assetkit/impl/AssetKitCreatorWorkflowProcess.java](../core/src/main/java/com/adobe/aem/commons/assetshare/workflow/assetkit/impl/AssetKitCreatorWorkflowProcess.java) | Updated |
| [core/src/main/java/com/adobe/aem/commons/assetshare/workflow/assetkit/impl/AssetKitReplicationWorkflowProcess.java](../core/src/main/java/com/adobe/aem/commons/assetshare/workflow/assetkit/impl/AssetKitReplicationWorkflowProcess.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/actions/impl/ActionHelperImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/actions/impl/ActionHelperImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/actions/impl/AssetDownloadHelperImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/actions/impl/AssetDownloadHelperImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/assetkit/impl/AssetKitImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/assetkit/impl/AssetKitImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/details/impl/EditorLinksImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/details/impl/EditorLinksImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/details/impl/ImageImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/details/impl/ImageImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/details/impl/MetadataImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/details/impl/MetadataImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/details/impl/VideoImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/details/impl/VideoImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/predicates/impl/PropertyPredicateImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/predicates/impl/PropertyPredicateImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/components/predicates/impl/options/CoreComponentsOptionItemTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/components/predicates/impl/options/CoreComponentsOptionItemTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/configuration/impl/ConfigImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/configuration/impl/ConfigImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/configuration/impl/selectors/ContentTypeSelectorImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/configuration/impl/selectors/ContentTypeSelectorImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/impl/AssetModelImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/impl/AssetModelImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/impl/CombinedPropertiesTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/impl/CombinedPropertiesTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/impl/MetadataSchemaPropertiesImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/impl/MetadataSchemaPropertiesImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/impl/datasources/AssetRenditionsDataSourceTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/impl/datasources/AssetRenditionsDataSourceTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/properties/impl/ComputedPropertiesImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/properties/impl/ComputedPropertiesImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/properties/impl/ContentTypeImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/properties/impl/ContentTypeImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/AssetRenditionParametersTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/AssetRenditionParametersTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/AssetRenditionTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/AssetRenditionTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionDownloadRequestTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionDownloadRequestTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionDownloadResponseTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionDownloadResponseTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionsDownloadServletTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionsDownloadServletTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionsExceptionTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionsExceptionTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionsZipperImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/download/impl/AssetRenditionsZipperImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/AssetRenditionDispatchersImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/AssetRenditionDispatchersImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/AssetRenditionServletTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/AssetRenditionServletTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/AssetRenditionsImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/AssetRenditionsImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/AbstractRenditionDispatcherImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/AbstractRenditionDispatcherImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/ExternalRedirectRenditionDispatcherImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/ExternalRedirectRenditionDispatcherImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/InternalRedirectRenditionDispatcherImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/InternalRedirectRenditionDispatcherImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/StaticRenditionDispatcherImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/content/renditions/impl/dispatchers/StaticRenditionDispatcherImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/search/impl/FastPropertiesImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/search/impl/FastPropertiesImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/search/impl/predicateevaluators/PredicateEvaluatorUtilTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/search/impl/predicateevaluators/PredicateEvaluatorUtilTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/search/impl/predicateevaluators/PropertyValuesPredicateEvaluatorTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/search/impl/predicateevaluators/PropertyValuesPredicateEvaluatorTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/testing/MockAssetModels.java](../core/src/test/java/com/adobe/aem/commons/assetshare/testing/MockAssetModels.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/PredicateUtilTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/PredicateUtilTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/UrlUtilTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/UrlUtilTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/AssetKitHelperImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/AssetKitHelperImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/componentupdaters/AssetKitComponentUpdaterImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/componentupdaters/AssetKitComponentUpdaterImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/componentupdaters/BannerComponentUpdaterImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/componentupdaters/BannerComponentUpdaterImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/componentupdaters/PageMetadataComponentUpdaterImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/componentupdaters/PageMetadataComponentUpdaterImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/datasources/ComponentUpdatersDataSourceTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/assetkit/impl/datasources/ComponentUpdatersDataSourceTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/ExpressionEvaluatorImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/ExpressionEvaluatorImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/JsonResolverImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/JsonResolverImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/OakIndexResolverTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/OakIndexResolverTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/RequireAemImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/RequireAemImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/ServletHelperImplTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/ServletHelperImplTest.java) | Updated |
| [core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/responses/DiscardingResponseWrapperTest.java](../core/src/test/java/com/adobe/aem/commons/assetshare/util/impl/responses/DiscardingResponseWrapperTest.java) | Updated |
| [dispatcher/pom.xml](../dispatcher/pom.xml) | Updated |
| [pom.xml](../pom.xml) | Updated |
| [ui.apps.structure/pom.xml](../ui.apps.structure/pom.xml) | Updated |
| [ui.apps/pom.xml](../ui.apps/pom.xml) | Updated |
| [ui.config/pom.xml](../ui.config/pom.xml) | Updated |
| [ui.content.sample/pom.xml](../ui.content.sample/pom.xml) | Updated |
| [ui.content/pom.xml](../ui.content/pom.xml) | Updated |
| [ui.frontend.theme.dark/pom.xml](../ui.frontend.theme.dark/pom.xml) | Updated |
| [ui.frontend.theme.light/pom.xml](../ui.frontend.theme.light/pom.xml) | Updated |

### Next steps <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="next-steps"></a>

1. Please review and accept the code changes using the diff viewer.If you are using a Private Repository, please ensure that updated dependencies are available.
1. 
1. In order to successfully verify these changes on your machine, you will need to change your project to Java 17. We verified the changes using [Amazon Corretto Java 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/what-is-corretto-17.html
) build environment.
1. If this project uses Maven CheckStyle, Enforcer, FindBugs or SpotBugs plugins, Q Code Transformation will disable those plugins when we build the project to verify proposed upgrades.