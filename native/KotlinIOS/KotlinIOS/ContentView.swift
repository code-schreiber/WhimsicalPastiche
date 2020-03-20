import SwiftUI
import SharedCode

struct ContentView: View {
    var body: some View {
        let newText = CommonKt.createApplicationScreenMessage()
        return Text(newText)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
