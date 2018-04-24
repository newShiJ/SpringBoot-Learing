package learning.controller;

import com.github.pagehelper.PageHelper;
import learning.mapper.BillInfoMapper;
import learning.model.BillInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenmingming
 * @date 2018/4/16
 */
@RestController
@RequestMapping("/test")
@Service
public class TestController {

    @Autowired
    private BillInfoMapper billInfoMapper;

    @RequestMapping("/select")
    public Object setect(){
        PageHelper.startPage(1,10);
        List<BillInfo> list = billInfoMapper.selectAll();
        BillInfo billInfo = list.get(4);
        billInfo.setBusinessNo("<><>><><><><>");
        //billInfo.setVersion(1);
        billInfoMapper.updateByPrimaryKey(billInfo);
        return list;
    }
}
