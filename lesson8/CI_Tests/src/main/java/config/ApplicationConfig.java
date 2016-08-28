package config;

import ru.qatools.properties.Property;
import ru.qatools.properties.Resource;

@Resource.Classpath("application.properties")
public interface ApplicationConfig {

    @Property("environment")
    String getEnvironment();

    @Property("grid.hub.url")
    String getHubUrl();
}
