package com.rubenskj.extracao.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StrategyConfiguration {

    @Bean
    public ExportacaoStratagy getExportacao() {
        ExportacaoStrategyRDA.initilize();

        return new ExportacaoStrategyCDD();
    }
}
