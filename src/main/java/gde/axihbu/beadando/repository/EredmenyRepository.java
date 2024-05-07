package gde.axihbu.beadando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gde.axihbu.beadando.entry.EredmenyEntry;

public interface EredmenyRepository extends JpaRepository<EredmenyEntry,Long > {
    List<EredmenyEntry> findAllByVerseny_VersenyId(Long id);
}
