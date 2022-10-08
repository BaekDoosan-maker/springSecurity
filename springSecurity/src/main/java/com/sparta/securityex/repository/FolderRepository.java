package com.sparta.securityex.repository;

import com.sparta.securityex.domain.Folder;
import com.sparta.securityex.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
    List<Folder> findAllByUserAndNameIn(User user, List<String> names);
}
