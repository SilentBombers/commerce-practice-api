package silentbombers.commerce.member.domain

data class Member(
    val id: Int,
    val name: String,
    val phoneNumber: String?,
    val address: String?,
) {
}