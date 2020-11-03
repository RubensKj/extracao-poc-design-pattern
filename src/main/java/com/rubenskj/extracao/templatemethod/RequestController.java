package com.rubenskj.extracao.templatemethod;

import com.rubenskj.extracao.RequestExportacao;
import com.rubenskj.extracao.TipoExportacao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RequestController {

//    private final Exportacao exportacao;
//
//    public RequestController(Exportacao exportacao) {
//        this.exportacao = exportacao;
//    }
//
//    @GetMapping("/template/{tipoExportacao}")
//    public void templateTeste(@PathVariable("tipoExportacao") TipoExportacao tipoExportacao) {
//        this.exportacao.execute(new RequestExportacao(UUID.randomUUID().toString(), "1", "dfghsfdh", tipoExportacao, "adgadg"));
//    }
}
