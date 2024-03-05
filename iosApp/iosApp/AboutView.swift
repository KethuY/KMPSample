import SwiftUI
import shared

struct AboutView: View {
private struct RowItem: Hashtable{
let label:String
let value:String
}

}

private let items: [RowItem]={
let platform=Platform()

var result:[RowItem]=[
.init(label :"OS Name", platform.osName),
.init(label :"OS Version", platform.osVersion),
.init(label :"OS Model", platform.model),
.init(label :"OS Density", platform.density),
]
return result
}()
	var body: some View {
	List{
	ForEach(items, id:\.self){ it in
VStack(alignment: .leading){
  Text( it.label ).font(.footNote).forgroundStyle(.secondary)
    Text( it.value ).font(.footNote).forgroundStyle(.secondary)
}.padding(.vertical, 4)
	}
	}
	}


#Preview{
AboutView()
}