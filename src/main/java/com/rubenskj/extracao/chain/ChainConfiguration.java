package com.rubenskj.extracao.chain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ChainConfiguration {

    @Bean
    public Exporta getExporta() {
        return new ExportacaoCDD(
                new ExportacaoRTM(
                        new ExportacaoRDA()
                )
        );
    }
}
