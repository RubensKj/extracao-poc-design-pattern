package com.rubenskj.extracao.templatemethod;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;
import org.springframework.stereotype.Component;

@Component
public class ExportacaoTemplateRDA extends TemplateExportacao {
    public ExportacaoTemplateRDA() {
        super(TipoExportacao.RDA);
    }

    @Override
    public void run(RequestExportacao requestExportacao) {
        System.out.println("RDA IS WORKING");
        System.out.println(requestExportacao.toString());
    }
}
