package dataProvider;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigFileReader {

	private Properties projectProperties;

    public ConfigFileReader() {
        projectProperties = new Properties();
        Path projectPropsPath = Paths.get("configurations", "project.properties");
        try {
            InputStream inputStream = new FileInputStream(projectPropsPath.toFile());
            projectProperties.load(inputStream);
            
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String getUrl()
    {
        return projectProperties.getProperty("url");
    }
}
