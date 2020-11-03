package com.rubenskj.extracao.templatemethod;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;
import org.springframework.stereotype.Component;

@Component
public class ExportacaoTemplateCDD extends TemplateExportacao {
    public ExportacaoTemplateCDD() {
        super(TipoExportacao.CDD);
    }

    @Override
    public void run(RequestExportacao requestExportacao) {
        System.out.println("CDD Template Method here");
    }
}
