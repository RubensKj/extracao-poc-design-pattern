package com.rubenskj.extracao.strategy;

import com.rubenskj.extracao.RequestExportacao;

public interface ExportacaoStratagy {

    void execute(RequestExportacao requestExportacao);
}
