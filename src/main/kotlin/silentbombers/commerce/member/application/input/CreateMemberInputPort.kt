package silentbombers.commerce.member.application.input

import silentbombers.commerce.member.domain.Member

interface CreateMemberInputPort {
    fun save(member: Member)
}