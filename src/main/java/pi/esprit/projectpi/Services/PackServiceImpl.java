package pi.esprit.projectpi.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pi.esprit.projectpi.Entities.Pack;
import pi.esprit.projectpi.Repositories.PackRepository;

import java.util.List;
import java.util.Set;
@Service
@RequiredArgsConstructor

public class PackServiceImpl implements IpackService {
    @Autowired
    PackRepository packRepository;
    @Override
    public void ajouterPack(Pack p) {
        packRepository.save(p);

    }

    @Override
    public void updatePack(Pack p) {
packRepository.save(p);
    }

    @Override
    public List<Pack> getAllPack() {
        return packRepository.findAll();
    }

    @Override
    public Pack getById(Integer idPack) {
        return packRepository.findById(idPack).orElse(null);
    }

    @Override
    public void deletePack(Integer idPack) {
packRepository.deleteById(idPack);
    }
}
