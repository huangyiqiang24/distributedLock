package cn.huayq.distributedLock.configuration;

import cn.huayq.distributedLock.test.DateFormatProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 10:14 2024/4/15
 */
@Configuration
@EnableConfigurationProperties(DateFormatProperties.class)
@ConditionalOnProperty(prefix = "formatter", name = "enabled", havingValue = "true")
public class DateFormatConfiguration {

    private DateFormatProperties dateFormatProperties;
    public DateFormatConfiguration(DateFormatProperties dateFormatProperties) {
        this.dateFormatProperties = dateFormatProperties;
    }
    @Bean(name = "myDateFormatter")
    public SimpleDateFormat myDateFormatter() {
        System.out.println("start to initialize SimpleDateFormat with pattern: " + dateFormatProperties.getPattern());
        return new SimpleDateFormat(dateFormatProperties.getPattern());
    }


}
