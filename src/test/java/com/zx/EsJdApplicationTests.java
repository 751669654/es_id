package com.zx;

import com.zx.service.ContentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EsJdApplicationTests {

    @Autowired
    private ContentService contentService;
    @Test
    void contextLoads() {
    }

    @Test
    void test01() throws Exception {
        System.out.println(contentService.searchPageHighlightBuilder("2316", 1, 1));
    }
}
