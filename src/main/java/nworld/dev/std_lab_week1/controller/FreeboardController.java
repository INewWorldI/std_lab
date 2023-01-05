package nworld.dev.std_lab_week1.controller;

import nworld.dev.std_lab_week1.dto.FreeboardDto;
import nworld.dev.std_lab_week1.entity.Freeboard;
import nworld.dev.std_lab_week1.mapper.FreeboardMapper;
import nworld.dev.std_lab_week1.service.FreeboardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/board")
public class FreeboardController {

    private final FreeboardService freeboardService;
    private final FreeboardMapper mapper;

    public FreeboardController(FreeboardService freeboardService, FreeboardMapper mapper) {
        this.freeboardService = freeboardService;
        this.mapper = mapper;
    }

    @PostMapping("/post")
    public ResponseEntity<Freeboard> postBoard(@RequestBody @Valid FreeboardDto.Request.Post post) {
        Freeboard freeboard = mapper.freeboardToFreeboardDtoRquestPost(post);
        Freeboard createFreeboard = freeboardService.createFreeboard(freeboard);
        return ResponseEntity.status(HttpStatus.CREATED).body(createFreeboard);
    }

    @PatchMapping("/patch")
    public ResponseEntity<Freeboard> patchBoard(@RequestBody @Valid FreeboardDto.Request.Patch patch) {
        Freeboard freeboard = mapper.freeboardToFreeboardDtoRquestPatch(patch);
        Freeboard updateService = freeboardService.updateService(patch.getPostId(), freeboard);
        return ResponseEntity.ok(updateService);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBoard(@PathVariable Long id) {
        Freeboard findBoard = freeboardService.findFreeboard(id);
        return ResponseEntity.ok(findBoard);
    }

    @GetMapping
    public ResponseEntity<?> getAllBoard(@PathVariable Long page) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBoard(@PathVariable Long id) {
        freeboardService.removeFreeboard(id);
        return ResponseEntity.ok().build();
    }
}
