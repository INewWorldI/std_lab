package nworld.dev.std_lab_week1.service;

import nworld.dev.std_lab_week1.entity.Freeboard;
import nworld.dev.std_lab_week1.repository.FreeboardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class FreeboardService {

    private final FreeboardRepository freeboardRepository;

    public FreeboardService(FreeboardRepository freeboardRepository) {
        this.freeboardRepository = freeboardRepository;
    }

    @Transactional
    public Freeboard createFreeboard(Freeboard freeboard) {
        return freeboardRepository.save(freeboard);
    }

    @Transactional
    public Freeboard updateService(Long id, Freeboard freeboard) {
        Freeboard findFreeboard = findVarifiedFreeboard(id);
        Optional.ofNullable(freeboard.getTitle()).ifPresent(findFreeboard::setTitle);
        Optional.ofNullable(freeboard.getContent()).ifPresent(findFreeboard::setContent);
        Optional.ofNullable(freeboard.getWriter()).ifPresent(findFreeboard::setWriter);
        return freeboardRepository.save(findFreeboard);
    }

    public Freeboard findFreeboard(Long id) {
        return findVarifiedFreeboard(id);
    }

    @Transactional
    public void removeFreeboard(Long id) {
        freeboardRepository.deleteById(findVarifiedFreeboard(id).getId());
    }

    public Freeboard findVarifiedFreeboard(Long id) {
        Optional<Freeboard> freeboard = freeboardRepository.findById(id);
        return freeboard.orElseThrow(() -> new RuntimeException());
    }
}
