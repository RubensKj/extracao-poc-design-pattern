package com.rubenskj.extracao.chain;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;

public class ExportacaoRTM extends TemplateExportacao {
    public ExportacaoRTM(Exporta exporta) {
        super(exporta, TipoExportacao.RTM);
    }

    @Override
    public void exporta(RequestExportacao requestExportacao) {
        System.out.println("RTM IS WORKING");
    }
}
