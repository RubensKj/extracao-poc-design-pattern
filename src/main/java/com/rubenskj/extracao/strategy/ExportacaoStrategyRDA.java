package com.rubenskj.extracao.strategy;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;

public class ExportacaoStrategyRDA implements ExportacaoStratagy {

    private static ExportacaoStrategyRDA instance;

    public static ExportacaoStrategyRDA initilize() {
        if (instance == null) {
            instance = new ExportacaoStrategyRDA();
        }

        return instance;
    }

    @Override
    public void execute(RequestExportacao requestExportacao) {
        if (!requestExportacao.getTipoExportacao().equals(TipoExportacao.CDD)) {
            return;
        }

        System.out.println("RDA IS WORKING");
    }
}
