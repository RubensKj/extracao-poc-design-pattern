package com.rubenskj.extracao.chain;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;

public class ExportacaoRDA extends TemplateExportacao {

    public ExportacaoRDA() {
        super(null, TipoExportacao.RDA);
    }

    @Override
    public void exporta(RequestExportacao requestExportacao) {
        System.out.println(requestExportacao.toString());
    }
}
