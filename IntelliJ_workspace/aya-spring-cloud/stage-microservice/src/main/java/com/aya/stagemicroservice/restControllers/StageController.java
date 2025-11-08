package com.aya.stagemicroservice.restControllers;

import com.aya.stagemicroservice.config.Configuration;
import com.aya.stagemicroservice.dto.StageDto;
import com.aya.stagemicroservice.service.StageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stages")


public class StageController {
    private StageService stageService;
    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    Configuration configuration;

    public StageController(StageService stageService) {
        this.stageService = stageService;
    }

    @GetMapping("{lieuStage}")
    public ResponseEntity<StageDto> getStageBylieuStage(@PathVariable("lieuStage")
                                                      String lieuStage )
    {
        return new ResponseEntity<StageDto>(
                stageService.getStageBylieuStage(lieuStage),
                HttpStatus.OK);
    }

    @GetMapping("/version")
    public ResponseEntity<String> version() {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }
    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}
