package com.rubenskj.extracao.chain;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ChainController {

    private final Exporta exporta;

    public ChainController(Exporta exporta) {
        this.exporta = exporta;
    }

    @GetMapping("/teste/{tipoExportacao}")
    public void teste(@PathVariable("tipoExportacao") TipoExportacao tipoExportacao) {
        this.exporta.execute(new RequestExportacao(UUID.randomUUID().toString(), "1", "dfghsfdh", tipoExportacao, "adgadg"));
    }
}
