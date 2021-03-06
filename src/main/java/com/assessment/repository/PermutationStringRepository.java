package com.assessment.repository;

import com.assessment.domain.PermutationString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PermutationStringRepository extends JpaRepository<PermutationString, Integer>
{
    PermutationString findByInput(String input);
}
