import com.steady.util.Tree2ExcelUtil;
import org.apache.commons.compress.utils.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class DemoTest {

    @Test
    public void testExportExcel(){
        String filePath="E:\\" + System.currentTimeMillis() + ".xls";
        List<Map> treeList= Lists.newArrayList();
        Tree2ExcelUtil.tree2Excel(treeList,filePath , "name", "children");
    }
}
