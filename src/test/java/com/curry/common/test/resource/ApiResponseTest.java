package com.curry.common.test.resource;

import com.curry.common.resource.ApiResponse;
import org.junit.jupiter.api.Test;

import java.io.Serializable;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 测试类
 *
 * @author curry
 * @since 2022-10-24
 */
class ApiResponseTest {
    @Test
    void testOk() {
        ApiResponse<Serializable> response = ApiResponse.ok();
        assertThat(response.getCode()).isZero();
        assertThat(response.getMsg()).isNull();
        assertThat(response.getResult()).isNull();
    }
}
