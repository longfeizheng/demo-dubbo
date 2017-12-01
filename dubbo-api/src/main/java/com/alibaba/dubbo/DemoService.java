package com.alibaba.dubbo;

import java.util.List;

/**
 * Created on 2017/12/1.
 *
 * @author zlf
 * @since 1.0
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
