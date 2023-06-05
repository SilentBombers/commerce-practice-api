package silentbombers.commerce.member.adapter.output

import org.springframework.stereotype.Component
import silentbombers.commerce.member.application.output.SaveMemberOutputPort
import silentbombers.commerce.member.domain.Member

@Component
class SaveMemberOutputAdapter(
    val memberJpaRepository: MemberJpaRepository,
    val mapper: MemberMapper,
) : SaveMemberOutputPort {
    override fun save(member: Member) {
        memberJpaRepository.save(mapper.map(member))
    }
}