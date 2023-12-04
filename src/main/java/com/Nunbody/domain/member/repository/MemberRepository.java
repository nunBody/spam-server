package com.Nunbody.domain.member.repository;


import com.Nunbody.domain.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByAccount(String account);

    Optional<String> findNaverIdById(Long id);

    Optional<String> findNaverPasswordById(Long userId);
}
