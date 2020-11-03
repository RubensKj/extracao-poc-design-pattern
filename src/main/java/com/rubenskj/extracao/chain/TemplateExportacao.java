package com.rubenskj.extracao.chain;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;
import org.springframework.stereotype.Component;

@Component
public abstract class TemplateExportacao implements Exporta {

    private Exporta exporta;
    private TipoExportacao tipoExportacao;

    public TemplateExportacao(Exporta exporta, TipoExportacao tipoExportacao) {
        this.exporta = exporta;
        this.tipoExportacao = tipoExportacao;
    }

    @Override
    public void execute(RequestExportacao requestExportacao) {
        TipoExportacao tipoExportacao = requestExportacao.getTipoExportacao();

        if (tipoExportacao.equals(getTipoExportacao())) {
            exporta(requestExportacao);
            return;
        }

        if (exporta != null) {
            exporta.execute(requestExportacao);
        }
    }

    public abstract void exporta(RequestExportacao requestExportacao);

    public TipoExportacao getTipoExportacao() {
        return tipoExportacao;
    }
}
