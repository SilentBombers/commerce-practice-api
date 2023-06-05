package silentbombers.commerce.member.adapter.output

import org.springframework.stereotype.Component
import silentbombers.commerce.member.domain.Member

@Component
class MemberMapper {

    fun of(source: MemberEntity): Member {
        return Member(
            source.id, source.name, source.phoneNumber, source.address
        )
    }

    fun map(member: Member): MemberEntity {
        return MemberEntity(
            member.id,
            member.name,
            member.phoneNumber,
            member.address
        )
    }
}