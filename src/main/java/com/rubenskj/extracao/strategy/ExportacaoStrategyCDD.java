package com.rubenskj.extracao.strategy;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;

public class ExportacaoStrategyCDD implements ExportacaoStratagy {
    @Override
    public void execute(RequestExportacao requestExportacao) {
        if (!requestExportacao.getTipoExportacao().equals(TipoExportacao.CDD)) {
            return;
        }

        System.out.println("CDD IS WORKING");
    }
}
