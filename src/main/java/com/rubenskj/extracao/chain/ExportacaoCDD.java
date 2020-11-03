package com.rubenskj.extracao.chain;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;

public class ExportacaoCDD extends TemplateExportacao {

    public ExportacaoCDD(Exporta exporta) {
        super(exporta, TipoExportacao.CDD);
    }

    @Override
    public void exporta(RequestExportacao requestExportacao) {
        System.out.println("CDD Executing");
    }
}
