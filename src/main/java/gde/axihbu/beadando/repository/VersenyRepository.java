package gde.axihbu.beadando.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gde.axihbu.beadando.entry.VersenyEntry;

public interface VersenyRepository extends JpaRepository<VersenyEntry,Long > {}
