package silentbombers.commerce.member.adapter.input

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import silentbombers.commerce.member.application.input.CreateMemberInputPort
import silentbombers.commerce.member.domain.Member

@RestController
class MemberController(
    val createMember: CreateMemberInputPort
) {

    @PostMapping("/api/v1/members")
    fun save(@RequestBody member: Member) {
        createMember.save(member)
    }
}