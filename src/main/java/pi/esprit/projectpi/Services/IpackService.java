package pi.esprit.projectpi.Services;

import pi.esprit.projectpi.Entities.Pack;

import java.util.List;
import java.util.Set;

public interface IpackService {
    void ajouterPack(Pack p);
    void updatePack(Pack p);
    List<Pack> getAllPack();
    Pack getById(Integer idPack);
    void deletePack(Integer idPack);
}
