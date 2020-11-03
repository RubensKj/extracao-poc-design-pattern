package com.rubenskj.extracao.templatemethod;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;

public abstract class TemplateExportacao implements Exportacao {

    private TipoExportacao tipoExportacao;

    public TemplateExportacao(TipoExportacao tipoExportacao) {
        this.tipoExportacao = tipoExportacao;
    }

    @Override
    public void execute(RequestExportacao requestExportacao) {
        if (requestExportacao.getTipoExportacao().equals(tipoExportacao)) {
            run(requestExportacao);
        }
    }

    public abstract void run(RequestExportacao requestExportacao);
}
