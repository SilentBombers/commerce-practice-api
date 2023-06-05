package silentbombers.commerce.member.application.output

import silentbombers.commerce.member.domain.Member

interface SaveMemberOutputPort {

    fun save(member: Member)
}