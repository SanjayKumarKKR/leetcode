func interpret(command string) string {
    ans:=""
    for i:=0;i<len(command);i++{
        if string(command[i])=="G"{
            ans+="G"
        }else if string(command[i])=="("{
            i++;
            if string(command[i])==")"{
                ans+="o"
            } else if string(command[i])=="a"{
                i++
                if string(command[i])=="l"{
                    i++
                    if string(command[i])==")"{
                        ans+="al"
                    }
                }
            }
        }
        
    }
    return ans
}