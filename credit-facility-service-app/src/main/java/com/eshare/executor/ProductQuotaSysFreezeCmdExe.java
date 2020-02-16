package com.eshare.executor;

import com.alibaba.cola.command.Command;
import com.alibaba.cola.command.CommandExecutorI;
import com.alibaba.cola.dto.Response;
import com.eshare.domain.constant.FrozenStatusEnum;
import com.eshare.domain.creditlimit.ProductLimit;
import com.eshare.dto.ProductQuotaSysFreezeCmd;
import com.eshare.dto.QuotaRecoveryCmd;
import com.eshare.repository.ProductLimitRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 产品额度系统冻结执行类
 * @Author Evan Leung
 *
 */
@Command
public class ProductQuotaSysFreezeCmdExe implements CommandExecutorI<Response, ProductQuotaSysFreezeCmd> {

    private final ProductLimitRepository productLimitRepository;


    @Autowired
    public ProductQuotaSysFreezeCmdExe(ProductLimitRepository productLimitRepository) {
        this.productLimitRepository = productLimitRepository;
    }

    @Override
    public Response execute(ProductQuotaSysFreezeCmd cmd) {
        ProductLimit productLimit = productLimitRepository.find(cmd.getAccountId());
        // 系统冻结
        productLimitRepository.freeze(productLimit, FrozenStatusEnum.SYSTEM_FROZEN);
        return Response.buildSuccess();
    }
}
