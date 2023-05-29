package silentbombers.commerce.member.adapter.output

import jakarta.persistence.*

@Entity
class MemberEntity(
    id: String,
    name: String,
    phoneNumber: String?,
    address: String?,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: String = id

    @Column
    val name: String = name

    @Column
    val phoneNumber: String? = phoneNumber

    @Column
    val address: String? = address
}