package com.edu.mix.mvc.model;

/**
 * 模型行为分发接口  门面模式
 */
public interface IActionDispather {
    //根据Action的名字，返回处理结果
    public String actionInvoke(String actionName);
}
