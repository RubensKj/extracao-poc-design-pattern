package com.rubenskj.extracao.strategy;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class StrategyController {

    private final ExportacaoStratagy exportacao;

    public StrategyController(ExportacaoStratagy exportacao) {
        this.exportacao = exportacao;
    }

    @GetMapping("/strategy/{tipoExportacao}")
    public void templateTeste(@PathVariable("tipoExportacao") TipoExportacao tipoExportacao) {
        this.exportacao.execute(new RequestExportacao(UUID.randomUUID().toString(), "1", "dfghsfdh", tipoExportacao, "adgadg"));
    }
}
