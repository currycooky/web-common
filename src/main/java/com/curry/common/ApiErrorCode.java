package com.curry.common;

/**
 * 自定义Api相应的code值，不同的异常应该定义为不同的值
 *
 * @author curry
 * @since 2022-10-24
 */
public interface ApiErrorCode {
    /**
     * 返回API的相应code
     *
     * @return code
     */
    int value();
}
