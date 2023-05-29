package silentbombers.commerce.member.application

import org.springframework.stereotype.Service
import silentbombers.commerce.member.adapter.output.SaveMemberOutputAdapter
import silentbombers.commerce.member.application.input.CreateMemberInputPort
import silentbombers.commerce.member.domain.Member

@Service
class CreateMemberUseCase(
    val saveMemberOutputAdapter: SaveMemberOutputAdapter
) : CreateMemberInputPort {
    override fun save(member: Member) {
        saveMemberOutputAdapter.save(member)
    }
}