import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void extName1() {
        assertEquals("Vlad!!!!!!", StringUtils.rightPad("Vlad", 10, '!'));
    }

    @Test
    void extName2() {
        assertEquals("Vlad++++++", StringUtils.rightPad("Vlad", 10,'+'));
    }

    @Test
    void abbrStringMaxWidth10() {
        assertEquals("Привет ...", StringUtils.abbreviate("Привет всем кто живет на луне!", 10));
    }

    @Test
    void abbrStringMaxWidth20() {
        assertEquals("Привет всем кто ж...", StringUtils.abbreviate("Привет всем кто живет на луне!", 20));
    }
}