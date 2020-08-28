package cn.iponkan.openapi.annotation;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author dongtangqiang
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Transactional(propagation = Propagation.REQUIRED, readOnly = true,
        rollbackFor = Throwable.class, isolation = Isolation.READ_COMMITTED)
public @interface TxReadOnly {
}
