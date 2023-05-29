package silentbombers.commerce.member.adapter.output

import org.springframework.data.jpa.repository.JpaRepository

interface MemberJpaRepository : JpaRepository<MemberEntity, Long> {
}