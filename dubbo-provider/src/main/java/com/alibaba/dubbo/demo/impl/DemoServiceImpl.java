package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017/12/1.
 *
 * @author zlf
 * @since 1.0
 */
public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
