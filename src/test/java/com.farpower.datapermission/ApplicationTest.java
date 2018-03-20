package com.farpower.datapermission;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.farpower.datapermission.service.ResourceInfoService;
import com.farpower.himalayas.organ.model.ResourceInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest
{
    @Autowired
    private ResourceInfoService resourceInfoServicel;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testSql(){
        EntityWrapper<ResourceInfo> wrapper = new EntityWrapper<>();
        wrapper.eq("code", "com.farpower.himalayas.code.resourceInfo")
                //.or()
                //.eq("par_name", str)
                .orderBy("create_time", false);   // 时间的倒叙排列
                //.limit(0, 1);                    // 取一条
        ResourceInfo info = resourceInfoServicel.selectOne(wrapper);
        System.out.println(info);
    }
}
