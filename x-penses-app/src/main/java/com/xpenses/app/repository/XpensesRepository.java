package com.xpenses.app.repository;

import com.xpenses.app.model.XpenseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XpensesRepository extends JpaRepository<XpenseModel, Long> {
}
